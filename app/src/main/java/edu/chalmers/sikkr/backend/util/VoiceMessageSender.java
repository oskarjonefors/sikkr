package edu.chalmers.sikkr.backend.util;

import android.content.Context;

import edu.chalmers.sikkr.backend.Contact;
import edu.chalmers.sikkr.backend.MessageNotSentException;
import edu.chalmers.sikkr.backend.VoiceMessage;

/**
 * Created by ivaldi on 2014-10-01.
 */

public class VoiceMessageSender {

    private final static VoiceMessageSender singleton = new VoiceMessageSender();
    private Context context;
    private Contact receiver;

    private VoiceMessageSender() {}

    private void setup(Context context) {
        this.context = context;
    }

    public VoiceMessageSender getSharedInstance() {
        if(context == null) {
            throw new UnsupportedOperationException("Context must be supplied through the method" +
                    "setupSingleton(Context context) before an instance can be returned.");
        } else {
            return singleton;
        }
    }

    public void setupSingleton(Context context) {
        if(context == null) {
            throw new IllegalArgumentException("Context cannot be null.");
        } else {
            this.context = context;
        }
    }

    /**
     * Send the given VoiceMessage to the given number.
     * @param msg - The VoiceMessage to send.
     * @param receiverNbr - The number to send the voice message to.
     * @throws MessageNotSentException - If the message could not be sent.
     * @throws IllegalArgumentException - If the receiver is not a valid one.
     */
    public void sendMessage(VoiceMessage msg, String receiverNbr) throws MessageNotSentException, IllegalArgumentException {

    }
}