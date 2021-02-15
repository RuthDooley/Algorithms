public class Hanoi {
    public static int moves = 0;
    static int towersOfHanoi (int disk, int startRodNumber, int destRodNumber, int auxRodNumber){
        if (disk == 0){
            System.out.println("Move disk 0 from rod " + startRodNumber + " to " + destRodNumber);
            moves ++;
        } else {
            towersOfHanoi(disk-1, startRodNumber, auxRodNumber, destRodNumber);
            System.out.println("Move disk " + disk + " from rod " + startRodNumber + " to " + destRodNumber);
            towersOfHanoi(disk-1, auxRodNumber, destRodNumber, startRodNumber);
            moves ++;
        }
        return moves;
    }
}
