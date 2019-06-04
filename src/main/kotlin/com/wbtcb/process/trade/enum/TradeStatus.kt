package com.wbtcb.process.trade.enum

enum class TradeStatus {

    /**
     * Start trade process
     */
    TO_TRADE,

    PENDING,

    /**
     * Process createMarketOrder is success and completed
     */
    TRADED,

    /**
     *  Process is cancelled
     */
    CANCELLED,

    REJECTED,

    EXPIRED;
}
