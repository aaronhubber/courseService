package com.codeclan.example.courseservice.models;


import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Course {
    @NotNull
    private String name;
    @NotNull
    private String town;
    private int starRating;
    private List<Booking> bookings;
}
