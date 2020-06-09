package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

    private Review review;

    public ReviewController(){
        review = new Review("Ben's Burgers", "Ben","2013", 5, "This is a good cookbook.");
    }

    @RequestMapping("/review")
    public String retrieveReview(Model model){
        model.addAttribute("reviewToDisplay", review);
        return "review-template";

    }

}
