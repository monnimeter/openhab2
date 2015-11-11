/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.dscalarm.internal;

import java.util.EventObject;

/**
 * Event for Receiving API Messages.
 *
 * @author Russell Stephens - Initial Contribution
 */
public class DSCAlarmEvent extends EventObject {

    private static final long serialVersionUID = 1L;
    private DSCAlarmMessage dscAlarmMessage;

    /**
     * Constructor.
     *
     * @param source
     */
    public DSCAlarmEvent(Object source) {
        super(source);
    }

    /**
     * Adds the the received API Message to the event.
     *
     * @param dscAlarmMessage
     */
    public void dscAlarmEventMessage(DSCAlarmMessage dscAlarmMessage) {
        this.dscAlarmMessage = dscAlarmMessage;
    }

    /**
     * Returns the API Message event from the DSC Alarm System.
     *
     * @return apiMessage
     */
    public DSCAlarmMessage getDSCAlarmMessage() {
        return dscAlarmMessage;
    }

}
