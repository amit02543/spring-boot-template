package com.amit.util;

import com.amit.constant.CommonConstants;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

@Component
public class CommonUtility {


    /**
     * Generates and return zone specific current timestamp
     * in yyyy-MM-dd HH:mm:ss format
     *
     *
     * @return
     */
    public String getFormattedCurrentTimestamp() {

        return Instant
                .ofEpochMilli(new Date().getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime().format(CommonConstants.DATE_TIME_FORMATTER);
    }


}
