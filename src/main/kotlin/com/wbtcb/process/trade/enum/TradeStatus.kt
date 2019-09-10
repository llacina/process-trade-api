package com.wbtcb.process.trade.enum

enum class TradeStatus {

    /**
     * Created new trade process
     */
    CREATED,

    /**
     * Valid entity/message,ready to start to trade
     */
    VALID,

    /**
     * Invalid entity not valid entity/message
     */
    INVALID,

    /**
     * Start trade process
     */
    TO_TRADE,

    /**
     * Waiting to internal trade (cache)
     */
    OPEN_TRADE,

    PENDING,

    /**
     * Process createMarketOrder is success and completed
     */
    TRADED,

    /**
     * Process createMarketOrder is manually traded outside of system
     */
    MAN_TRADED,

    /**
     *  Process is cancelled
     */
    CANCELLED,

    REJECTED,

    EXPIRED;
}
