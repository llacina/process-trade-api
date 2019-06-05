package com.wbtcb.process.trade

class RabbitMqConstants {

    companion object {
        // Trade exchange
        const val TRADE_EXCHANGE = "trade"

        // Routing key
        const val TRADE_ROUTING_PREFIX_KEY = TRADE_EXCHANGE
   }
}
