import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class SnakeGame extends JFrame implements ActionListener, KeyListener {

    private static final long serialVersionUID = 1L;

    private final int gridSize = 20;
    private final int gridWidth = 20;
    private final int gridHeight = 20;
    private int[] snakeX, snakeY;
    private int snakeLength;
    private int foodX, foodY;
    private boolean left, right, up, down;
    private boolean gameOver;
    private Timer timer;

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(gridWidth * gridSize, gridHeight * gridSize);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        snakeX = new int[gridWidth * gridHeight];
        snakeY = new int[gridWidth * gridHeight];
        snakeLength = 1;

        left = right = up = down = false;
        gameOver = false;

        timer = new Timer(1500, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        initGame();
    }

    private void initGame() {
        snakeLength = 1;
        for (int i = 0; i < snakeLength; i++) {
            snakeX[i] = gridWidth / 2;
            snakeY[i] = gridHeight / 2;
        }

        spawnFood();
    }

    private void spawnFood() {
        Random random = new Random();
        foodX = random.nextInt(gridWidth);
        foodY = random.nextInt(gridHeight);
    }

    private void move() {
        for (int i = snakeLength; i > 0; i--) {
            snakeX[i] = snakeX[i - 1];
            snakeY[i] = snakeY[i - 1];
        }

        if (left) snakeX[0]--;
        if (right) snakeX[0]++;
        if (up) snakeY[0]--;
        if (down) snakeY[0]++;

        checkCollision();
        checkFood();
    }

    private void checkCollision() {
        if (snakeX[0] < 0 || snakeX[0] >= gridWidth || snakeY[0] < 0 || snakeY[0] >= gridHeight) {
            gameOver = true;
            timer.stop();
        }

        for (int i = snakeLength; i > 0; i--) {
            if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                gameOver = true;
                timer.stop();
            }
        }
    }

    private void checkFood() {
        if (snakeX[0] == foodX && snakeY[0] == foodY) {
            snakeLength++;
            spawnFood();
        }
    }

    private void draw(Graphics g) {
        if (!gameOver) {
            // Draw snake
            for (int i = 0; i < snakeLength; i++) {
                g.setColor(Color.GREEN);
                g.fillRect(snakeX[i] * gridSize, snakeY[i] * gridSize, gridSize, gridSize);
            }

            // Draw food
            g.setColor(Color.RED);
            g.fillRect(foodX * gridSize, foodY * gridSize, gridSize, gridSize);
        } else {
            // Game over
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("Game Over", gridWidth * gridSize / 2 - 120, gridHeight * gridSize / 2 - 20);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            move();
            repaint();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT && !right) {
            left = true;
            up = down = false;
        }

        if (key == KeyEvent.VK_RIGHT && !left) {
            right = true;
            up = down = false;
        }

        if (key == KeyEvent.VK_UP && !down) {
            up = true;
            left = right = false;
        }

        if (key == KeyEvent.VK_DOWN && !up) {
            down = true;
            left = right = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SnakeGame snakeGame = new SnakeGame();
            snakeGame.setVisible(true);
        });
    }
}
