void reverseString(char* s, int sSize) {
    int start = 0;
    int end = sSize - 1;

    //swap
    while(start <= end) {
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        start = start + 1;
        end = end -1;
    }
}