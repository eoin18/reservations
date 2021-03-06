package com.emccarthy.landon.web.application;

import java.util.List;

import com.emccarthy.landon.business.domain.RoomReservation;
import com.emccarthy.landon.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @RequestMapping(method = RequestMethod.GET)
    public String getReservations(@RequestParam(value = "date", required = false) String dateString, Model model){
        List<RoomReservation> roomReservations = this.reservationService.getRoomReservationsForDate(dateString);
        model.addAttribute("roomReservations", roomReservations);
        return "reservations";
    }

}
