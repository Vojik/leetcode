package com.vojik.solutions;

// not working correctly

/** 353. Design Snake Game */
public class Solution_353 {

  private int[][] board;
  private int[][] food;
  private boolean[][] snakeBody;
  private int score;
  private int curX;
  private int curY;

  private Snake head;
  private Snake tail;

  private int foodIdx = 0;


  /** Initialize your data structure here.
   @param width - screen width
   @param height - screen height
   @param food - A list of food positions
   E.g food = [[1,1], [1,0]] means the first food is positioned at [1,1], the second is at [1,0]. */
  public Solution_353(int width, int height, int[][] food) {
    this.board = new int[height][width];
    this.snakeBody = new boolean[height][width];
    snakeBody[0][0] = true;
    head = new Snake(0, 0);
    tail = head;
    this.food = food;
    this.score = 0;
    this.curX = 0;
    this.curY = 0;
  }

  /** Moves the snake.
   @param direction - 'U' = Up, 'L' = Left, 'R' = Right, 'D' = Down
   @return The game's score after the move. Return -1 if game over.
   Game over when snake crosses the screen boundary or bites its body. */
  public int move(String direction) {
    print();
    switch(direction) {
      case "U":
        curX--;
        break;
      case "L":
        curY--;
        break;
      case "R":
        curY++;
        break;
      case "D":
        curX++;
        break;
      default:
        throw new RuntimeException("Wrong direction: " + direction);
    }

    if (isGameOver(curX, curY)) {
      return -1;
    }

    if (checkFood(curX, curY)) {
      head.next = new Snake(curX, curY);
      head = head.next;
      snakeBody[curX][curY] = true;
      score++;
      foodIdx++;
    } else {
      head.next = new Snake(curX, curY);
      head = head.next;
      snakeBody[tail.i][tail.j] = false;
      snakeBody[curX][curY] = true;
      tail = tail.next;
    }
    return score;
  }

  private boolean checkFood(int i, int j) {
    return food[foodIdx][0] == i && food[foodIdx][1] == j;
  }

  private boolean isGameOver(int i, int j) {
    return i < 0 && j < 0 && i >= board.length && j >= board[0].length && snakeBody[i][j];
  }

  private void print() {
    for (int i = 0; i < snakeBody.length; i++) {
      for (int j = 0; j < snakeBody[0].length; j++) {
        if (snakeBody[i][j]) {
          System.out.println(i + " " + j);
        }

      }
    }

  }

  class Snake {
    int i;
    int j;
    Snake next;

    Snake(int i, int j) {
      this.i = i;
      this.j = j;
    }
  }

}
