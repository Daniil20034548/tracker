package ru.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder stringBuilder = new StringBuilder();
        int length = descendingElements.size();
        for (int i = 0; i < length * 2; i++) {
            String result = String.valueOf(evenElements.poll());
            if (evenElements.size() % 2 == 1) {
                stringBuilder.append(result);
            }
        }
        return stringBuilder.toString();
    }

    private String getDescendingElements() {
        StringBuilder stringBuilder = new StringBuilder();
        int length = descendingElements.size();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(descendingElements.pollLast());
        }
        return stringBuilder.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
