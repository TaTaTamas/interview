package com.job.interview.interview.controller;

import jobtest.MinimumDifference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MinimumDifferenceController {

    @Autowired
    MinimumDifference minimumDifference;


    @PostMapping("/minimumdifference")
    public int minimumDifferenceWithSorting(@RequestBody int[] numbers) {
        return minimumDifference.getMinimumDifferenceWithSorting(numbers);
    }
}


