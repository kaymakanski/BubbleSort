package sort;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SortController {
    @GetMapping("/bubblesort")
    public Collection<Move> getBubbleSort(@RequestParam(value="arrayToSort") String arrayToSort) {
        return BubbleSort.sort(parseArrayToSort(arrayToSort));
    }

    private static List<Integer> parseArrayToSort(String arrayToSort) {
        return Arrays.stream(arrayToSort.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
