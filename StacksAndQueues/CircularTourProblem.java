package level_1;
public class CircularTourProblem {
    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };
        int start = findStartingPoint(pumps);
        System.out.println(start); // Output: 2
    }

    public static int findStartingPoint(PetrolPump[] pumps) {
        int totalPetrol = 0, totalDistance = 0;
        int start = 0, currentSurplus = 0;
        for (int i = 0; i < pumps.length; i++) {
            totalPetrol += pumps[i].petrol;
            totalDistance += pumps[i].distance;
            currentSurplus += pumps[i].petrol - pumps[i].distance;
            if (currentSurplus < 0) {
                start = i + 1;
                currentSurplus = 0;
            }
        }
        return (totalPetrol >= totalDistance) ? start : -1;
    }
}
