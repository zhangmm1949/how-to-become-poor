package com.zmm.poor;

import java.util.Objects;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public final class QiongB {
    private final Log log;
    private final String name;

    public QiongB() {
        this("Anonymous");
    }

    public QiongB(String name) {
        this.log = LogFactory.getLog(this.getClass());
        this.name = (String) Objects.requireNonNull(name, "Name must be non null.");
    }

    public String getName() {
        return this.name;
    }
    public String howToBecomePoor() {
        if (this.log.isDebugEnabled()) {
            this.log.debug("How to become poor?");
        }

        return "Buy stocks.";
    }
}
