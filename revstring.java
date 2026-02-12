class revarray {
    public static void main(String[] args) {
        int k = 0;
        char[] arr = new char[6];
        char name[] = { 'v', 'e', 'd', 'a', 'n', 't' };

        for (int i = 5; i >= 0; i--) {
            arr[k++] = name[i];
        }

        System.out.println(arr);
    }
}