package com.scu.highestpeak.child.fly_advice.service.FlightStrategy;

import com.scu.highestpeak.child.fly_advice.domain.BO.AbstractFlightSection;
import com.scu.highestpeak.child.fly_advice.domain.DTO.FlightSearchDTO;

import java.util.List;

/**
 * @author highestpeak
 */
public class DefaultRoundTripStrategy implements FlightStrategy{
    @Override
    public List<AbstractFlightSection> strategy(FlightSearchDTO flightArgs) {
        return null;
    }

    @Override
    public STRATEGY name() {
        return STRATEGY.ROUND_TRIP;
    }
}
