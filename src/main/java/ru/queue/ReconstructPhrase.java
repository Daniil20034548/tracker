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
        for (int i = 1; i < evenElements.size(); i++) {
            if (i == 1) {
                stringBuilder.append(evenElements.peekFirst());
                i = i - 2;
            }
            evenElements.poll();
        }
        return stringBuilder.toString();
    }

    private String getDescendingElements() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < descendingElements.size(); i++) {
            stringBuilder.append(descendingElements.peekLast());
            descendingElements.pollLast();
            i--;
        }
        return stringBuilder.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
