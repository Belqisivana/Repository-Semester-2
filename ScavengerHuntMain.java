import java.util.Scanner; 
 
public class Point { 
    String question; 
    String answer; 
    Point next; 
 
    public Point(String question, String answer) { 
        this.question = question; 
        this.answer = answer; 
        this.next = null; 
    } 
 
    public Point(String question, String answer, Point next) { 
        this.question = question; 
        this.answer = answer; 
        this.next = next; 
    } 
} 
 
class ScavengerHunt { 
    Point startPoint; 
    Point currentPoint; 
    Scanner scanner; 
 
    public ScavengerHunt() { 
        startPoint = null; 
        currentPoint = null; 
        scanner = new Scanner(System.in); 
    } 
 
    public void addPoint(String question, String answer) { 
        Point newPoint = new Point(question, answer); 
 
        if (startPoint == null) { 
            startPoint = newPoint; 
            currentPoint = startPoint; 
        } else { 
            Point temp = startPoint; 
            while (temp.next != null) { 
                temp = temp.next; 
            } 
            temp.next = newPoint; 
        } 
    } 
 
    public boolean goToNextPoint(String answer) { 
        if (currentPoint == null) { 
            System.out.println("The game is already over!"); 
            return false; 
        } 
 
        while (!answer.equalsIgnoreCase(currentPoint.answer)) { 
            System.out.println("Jawaban salah! coba lagi."); 
            System.out.print("Masukkan jawaban: "); 
            answer = scanner.nextLine(); 
        } 
 
        System.out.println("Jawaban benar! lanjutkan permainan."); 
        currentPoint = currentPoint.next; 
        if (currentPoint != null) { 
            System.out.println(" "); 
            System.out.println("pertanyaan selanjutnya:"); 
            System.out.println(currentPoint.question); 
        } else { 
            System.out.println("Congratulations!"); 
        } 
        return true; 
    } 
 
    public void startGame() { 
        if (startPoint == null) { 
            System.out.println("No points added!"); 
            return; 
        } 
 
        System.out.println("Selamat datang di the scavenger hunt game!"); 
        System.out.println("Ikuti petualangan dengan menjawab pertanyaan!"); 
        System.out.println(startPoint.question); 
    } 
 
    public void closeScanner() { 
        scanner.close(); 
    } 
} 
 
public class ScavengerHuntMain { 
    public static void main(String[] args) { 
        ScavengerHunt hunt = new ScavengerHunt(); 
 
        hunt.addPoint("Teh, teh apa yang bisa dinaiki?", 
"Teh rio"); 
        hunt.addPoint("Hewan, hewan apa yang ga berisik?", 
"Semute"); 
        hunt.addPoint("Ayam, ayam apa yang besar?", "ayam semesta"); 
       
        hunt.startGame(); 
 
        boolean gameOn = true; 
        while (gameOn) { 
            System.out.print("Your answer: "); 
            String answer = hunt.scanner.nextLine(); 
            gameOn = hunt.goToNextPoint(answer); 
        } 
 
        hunt.closeScanner();
    }
}