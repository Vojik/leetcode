package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

/** 353. Design Snake Game */
public class Solution_353 {

  private final int width;
  private final int height;
  private final int[][] food;
  private int foodIdx;
  private int r;
  private int c;
  private final Set<Cell> snakeBody;
  private final Deque<Cell> snake;

  public Solution_353(int width, int height, int[][] food) {
    this.width = width;
    this.height = height;
    this.food = food;
    this.foodIdx = 0;
    this.r = 0;
    this.c = 0;
    this.snakeBody = new HashSet<>();
    this.snake = new ArrayDeque<>();

    Cell start = new Cell(r, c);
    this.snakeBody.add(start);
    this.snake.add(start);
  }

  public int move(String direction) {
    updatePosition(direction);
    if (!isInBoard()) {
      return -1;
    }

    Cell newHead = new Cell(r, c);
    Cell currentTail = this.snake.peekLast();

    // If any of the terminal conditions are satisfied, then we exit with rcode -1.
    if (snakeBody.contains(newHead) && !newHead.equals(currentTail)) {
      return -1;
    }

    if (foodIdx < food.length && food[foodIdx][0] == r && food[foodIdx][1] == c) { // food found!!
      this.foodIdx++;
    } else { // no food
      Cell oldTail = this.snake.removeFirst();
      this.snakeBody.remove(oldTail);
    }
    this.snake.addLast(newHead);
    this.snakeBody.add(newHead);

    return this.snake.size() - 1;
  }

  private void updatePosition(String direction) {
    switch (direction) {
      case "R":
        this.c++;
        break;
      case "L":
        this.c--;
        break;
      case "U":
        this.r--;
        break;
      case "D":
        this.r++;
        break;
      default:
        throw new RuntimeException("Wrong direction provided");
    }
  }

  private boolean isInBoard() {
    return r >= 0 && r < height && c >= 0 && c < width;
  }

  static class Cell implements Comparable<Cell> {

    int x;
    int y;

    Cell(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      Cell other = (Cell) obj;
      return this.x == other.x && this.y == other.y;
    }

    @Override
    public int hashCode() {
      return 31 * x + y;
    }

    @Override
    public int compareTo(Cell o) {
      if (this.x != o.x) {
        return this.x - o.x;
      }
      return this.y - o.y;
    }
  }

}
