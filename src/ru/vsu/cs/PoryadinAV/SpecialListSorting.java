package ru.vsu.cs.PoryadinAV;

import java.util.*;

public class SpecialListSorting {

    public List<Integer> specSortingList(List<Integer> list) {
        List<Integer> sortedList = normalSorting(list);

        if (equals(list, sortedList)) {
            return sortedList;
        }

        sortedList = deleteDifferences(sortedList, list);

        return sortedList;
    }

    private List<Integer> deleteDifferences(List<Integer> sortedList, List<Integer> list) {
        List<Integer> endList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if (Objects.equals(sortedList.get(i), list.get(i))) {
                endList.add(sortedList.get(i));
            }
        }

        return endList;
    }

    private boolean equals(List<Integer> list1, List<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            if (!Objects.equals(list1.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private List<Integer> normalSorting(List<Integer> list) {
        if (list.size()  < 2) {
            return list;
        } else {

            int pivot = list.get(0);
            List<Integer> lessThanPivot = new ArrayList<>();
            List<Integer> overThanPivot = new ArrayList<>();

            for (int i = 1; i < list.size(); i++) {
                int value = list.get(i);
                if (value > pivot) {
                    overThanPivot.add(value);
                } else {
                    lessThanPivot.add(value);
                }
            }

            List<Integer> answer = new ArrayList<>();
            answer.addAll(normalSorting(lessThanPivot));
            answer.add(pivot);
            answer.addAll(normalSorting(overThanPivot));

            return answer;
        }
    }

}
