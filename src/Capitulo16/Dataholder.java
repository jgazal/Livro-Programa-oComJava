package Capitulo16;

class DataHolder {
    private int[] data;
    public DataHolder() {
        data = new int[0];
    }
    public void insert(int x, int index) {
        increaseCapacity();
        shift(index);
        put(x, index);
    }
    private void increaseCapacity() {
        int[] newData = new int[data.length+1];
        for(int i = 0; i < data.length; i++)
            newData[i] = data[i];
        data = newData;
    }
    private void shift(int index) {
        for(int i = index; i < data.length-1; i++)
            data[i+1] = data[i];
    }
    private void put(int x, int index) {
        data[index] = x;
    }
    public int get(int index) {
        return data[index];
    }
    public int size() {
        return data.length;
    }
}
