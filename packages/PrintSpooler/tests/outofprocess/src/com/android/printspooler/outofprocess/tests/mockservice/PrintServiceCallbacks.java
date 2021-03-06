/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.android.printspooler.outofprocess.tests.mockservice;

import android.printservice.PrintJob;
import android.printservice.PrintService;

public abstract class PrintServiceCallbacks {

    private PrintService mService;

    public PrintService getService() {
        return mService;
    }

    public void setService(PrintService service) {
        mService = service;
    }

    public abstract PrinterDiscoverySessionCallbacks onCreatePrinterDiscoverySessionCallbacks();

    public abstract void onRequestCancelPrintJob(PrintJob printJob);

    public abstract void onPrintJobQueued(PrintJob printJob);
}
