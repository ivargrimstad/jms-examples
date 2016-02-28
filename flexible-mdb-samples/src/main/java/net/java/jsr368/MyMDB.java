/*
 * The MIT License
 *
 * Copyright 2016 Ivar Grimstad (ivar.grimstad@gmail.com).
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.java.jsr368;

import javax.ejb.MessageDriven;
import javax.jms.ClientId;
import javax.jms.DurableSubscription;
import javax.jms.Message;
import javax.jms.QueueListener;
import javax.jms.SubscriptionName;
import javax.jms.TopicListener;

/**
 *
 * @author Ivar Grimstad (ivar.grimstad@gmail.com)
 */
@MessageDriven
public class MyMDB {

    @QueueListener("java:global/queueName")
    public void queueListernerCallback(Message message) {

    }

    @TopicListener("java:global/topicName")
    @DurableSubscription
    @SubscriptionName("mySubName")
    @ClientId("myClientId")
    public void topicListenerCallback(Message message) {

    }
}
