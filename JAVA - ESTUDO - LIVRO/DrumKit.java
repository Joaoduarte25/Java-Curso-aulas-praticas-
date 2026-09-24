class DrumKit{
    boolean topHat = true;
    boolean Snare = true;

    void playSnare(){
        System.out.println(" bang bang ba - bang");
    }

    void playTopHat(){
        System.out.println(" ding ding di - ding");
    }
}

class DrumkitTestDriver{
    public static void main(String[] args){
        DrumKit d = new DrumKit();
        d.playSnare();
        d.Snare = false;
        d.playTopHat();

        if (d.Snare == true){
            d.playSnare();
        }
    }
}