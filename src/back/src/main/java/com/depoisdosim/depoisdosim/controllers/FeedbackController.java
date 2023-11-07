package com.depoisdosim.depoisdosim.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.depoisdosim.depoisdosim.models.Feedback;
import com.depoisdosim.depoisdosim.models.Feedback.CreateFeedback;
import com.depoisdosim.depoisdosim.services.FeedbackService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/feedback")
@Validated
public class FeedbackController {
    
    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/{id}")
    public ResponseEntity<Feedback> findById(@PathVariable Long id) {
        Feedback obj = this.feedbackService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("/user/userId}")
    public ResponseEntity<List<Feedback>> findAllByUserId(@PathVariable Long userId) {
        List<Feedback> objs = this.feedbackService.findAllByUserId(userId);
        return ResponseEntity.ok().body(objs);
    }

    @PostMapping
    @Validated(CreateFeedback.class)
    public ResponseEntity<Void> create(@Valid @RequestBody Feedback obj) {
        this.feedbackService.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    @Validated(CreateFeedback.class)
    public ResponseEntity<Void> update(@Valid @RequestBody Feedback obj, @PathVariable Long id) {
        obj.setId(id);
        this.feedbackService.update(obj);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.feedbackService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
