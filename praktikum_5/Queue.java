/*
 * Nama : Maulida Cahya Kurnia
 * NIM  : A11.2023.15470
 */
import java.util.Scanner;
class Queue {
    private int[] queue;    // Array untuk menyimpan elemen antrian
    private int front, rear, capacity, size;

    /**
     * Konstruktor untuk menginisialisasi antrian.
     * @param capacity Kapasitas maksimum antrian.
     */
    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    /**
     * Menyisipkan elemen ke dalam antrian.
     * @param value Nilai yang akan dimasukkan.
     */
    public void insert(int value) {
        if (isFull()) {
            System.out.println("Full queue! Can't insert " + value);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        System.out.println(value + " has been inserted.");
    }

    /**
     * Menghapus elemen dari antrian.
     */
    public void remove() {
        if (isEmpty()) {
            System.out.println("Empty queue! Can't delete.");
            return;
        }
        System.out.println("Deleted: " + queue[front]);
        front = (front + 1) % capacity;
        size--;
    }

    /**
     * Mengambil elemen terdepan dari antrian tanpa menghapusnya.
     * @return Elemen terdepan dari antrian.
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty queue! Can't peek.");
            return -1;
        }
        return queue[front];
    }

    /**
     * Memeriksa apakah antrian kosong.
     * @return true jika antrian kosong, false jika tidak.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Memeriksa apakah antrian penuh.
     * @return true jika antrian penuh, false jika tidak.
     */
    public boolean isFull() {
        return size == capacity;
    }

    /**
     * Mendapatkan ukuran saat ini dari antrian.
     * @return Ukuran antrian.
     */
    public int getSize() {
        return size;
    }

    // Menampilkan elemen-elemen dalam antrian.
    public void display() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return;
        }
        System.out.print("Queue = ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

