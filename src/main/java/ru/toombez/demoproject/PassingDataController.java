package ru.toombez.demoproject;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/passing-data")
public class PassingDataController {
    @GetMapping("/path-variable/{id}")
    public String getByPathVariable(
        @PathVariable String id
    ) {
        return "Id: " + id;
    }

    @GetMapping("/query-params")
    public String getWithQueryParams(
        @RequestParam String sort
    ) {
        return "Sort param: " + sort;
    }

    @PostMapping("/body")
    public String postWithBody(
        @RequestBody PostDataDto data
    ) {
        return data.getUsername();
    }

    @PostMapping("/all-data/{id}/{other_id}")
    public String allData(
            @RequestBody PostDataDto data,
            @RequestParam String sort,
            @RequestParam String role,
            @PathVariable String id,
            @PathVariable String other_id
    ) {
        return "";
    }
}
