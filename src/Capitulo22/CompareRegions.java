package Capitulo22;

// Demonstra RegionMatches.

class CompareRegions {
    public static void main(String[] args) {
        String str1 = "Standing at river’s edge.";
        String str2 = "Running at river’s edge.";
        if(str1.regionMatches(9, str2, 8, 12))
            System.out.println("Regions match.");
        if(!str1.regionMatches(0, str2, 0, 12))
            System.out.println("Regions do not match.");
    }
}
