public class MyList<T> {
    private T[] array;

    public MyList() {
        this.array = (T[]) new Object[10];
    }

    public MyList(int capacity) {
        this.array = (T[]) new Object[capacity];
    }

    public int size() {
        int count = 0;
        for (T a : this.array) {
            if (a != null)
                count++;
        }
        return count;
    }

    public int getCapacity() {

        return this.array.length;
    }

    public void addData(T data) {
        if (this.size() == this.getCapacity()) {
            T[] newArray = (T[]) new Object[this.getCapacity() * 2];
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }
        this.array[this.size()] = data;
    }

    public T getIndex(int index) {
        if (index > this.getCapacity()) {
            return null;
        } else
            return this.array[index];
    }

    public T remove(int index) {
        if (index > this.size() || index < 0)
            return null;
        int temp = index;
        for (int i = index; i < this.size(); i++) {
            this.array[temp] = this.array[temp + 1];
        }
        return this.array[index];
    }

    public T setIndex(int index, T data) {
        if (index > this.size() || index < 0)
            return null;

        return this.array[index] = data;
    }

    public String tooString() {
        StringBuilder sb = new StringBuilder();
        for (T i : array) {
            if (i != null) {
                sb.append(i.toString() + " ");
            }
        }
        return sb.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.size(); i++) {
            if (this.array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lasIndexOff(T data) {
        int index = 0;
        for (int i = 0; i < this.size(); i++) {
            if (array[i] == data) {
                index = i;
            }
        }
        return index;
    }

    public boolean isEmpty() {
        for (int i = 0; i < this.array.length; i++) {
            if (array[i] == null)
                return false;
            else
                return true;
        }
        return false;
    }

    public T[] toNewArray() {
        T[] newArray = (T[]) new Object[this.size()];
        for (int i = 0; i < this.size(); i++) {
            newArray[i] = this.array[i];
        }
        return newArray;
    }

    public void clear() {
        for (int i = 0; i < this.size(); i++) {
            this.array[i] = null;
        }
    }

    MyList<T> sublist(int start, int finish) {
        MyList<T> newList = new MyList<>(finish-start);
        if (this.size() < start || start < 0 || finish > this.size() || finish < 0 || finish <start) {
            return null;
        } else {
            for (int i = start; i < finish; i++) {
                newList.addData(this.array[i]);
            }
        }
        return newList;
    }

    public boolean contains(T data) {
        for (T a : this.array) {
            if (a == data) {
                return true;
            }
        }
        return false;
    }


}
