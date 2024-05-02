package Slides303_3_3;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("filename.txt");

        // 0123456789012345
        // new_filename.txt


        sb.insert(0, "new");

        // 0123456789012345
        // new_filename.txt


        sb.replace(0, 4, "old_" );
        // 0123456789012345
        // new_filename.txt

        System.out.println(sb);

        sb.replace(0, 4, "very_old_");

        // 0123456789012345
        // new_filename.txt
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        // 0123456789012345
        // new_filename.txt
        sb.delete(0, 4);
        System.out.println(sb);
    }
}
