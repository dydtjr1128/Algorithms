import java.io.*;
import java.util.*;

public class Main {
    public static void dfs_stack(ArrayList<Integer> v[], int s, BufferedWriter writer) throws IOException {
        Stack<Integer> stack = new Stack<>();
        int n = v.length;
        boolean isVisited[] = new boolean[n];
        boolean flag;
        stack.push(s);
        isVisited[s] = true;
        writer.write(s + " ");

        while (!stack.isEmpty()) {
            int ss = stack.peek();
            flag = false;
            for (int vvv : v[ss]) {
                if (!isVisited[vvv]) {
                    stack.push(vvv);
                    writer.write(vvv + " ");
                    isVisited[vvv] = true;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                stack.pop();
            }
        }
        writer.newLine();
    }

    public static void bfs_queue(ArrayList<Integer> v[], int s, BufferedWriter writer) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        int n = v.length;
        int vv;
        boolean isVisited[] = new boolean[n];

        queue.add(s);
        isVisited[s] = true;
        while (!queue.isEmpty()) {
            vv = queue.poll();
            writer.write(vv + " ");
            for (int vvv : v[vv]) {
                if (!isVisited[vvv]) {
                    queue.add(vvv);
                    isVisited[vvv] = true;
                }
            }
        }
        writer.newLine();
    }

    public static void dfs(ArrayList<Integer> v[], boolean isVisited[], int s, BufferedWriter writer) throws IOException {
        if(isVisited[s])
            return ;
        isVisited[s] = true;
        writer.write(s + " ");
        for (int i : v[s]) {
            if (!isVisited[i]) {
                dfs(v, isVisited, i, writer);
            }
        }
    }

    public static void bfs(ArrayList<Integer> v[], boolean isVisited[], int s, BufferedWriter writer) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        isVisited[s] = true;
        while (!queue.isEmpty()) {
            s = queue.poll();
            writer.write(s + " ");
            for (int vv : v[s]) {
                if (!isVisited[vv]) {
                    queue.add(vv);
                    isVisited[vv] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String temp[] = reader.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);//정점의 갯수
        int m = Integer.parseInt(temp[1]);//간선의 갯수
        int s = Integer.parseInt(temp[2]);//시작 점
        ArrayList<Integer> v[] = new ArrayList[n + 1];
        int a, b;

        boolean isVisited[] = new boolean[n + 1];
        for (int i = 0; i < n + 1; i++) {
            v[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            temp = reader.readLine().split(" ");
            a = Integer.parseInt(temp[0]);
            b = Integer.parseInt(temp[1]);

            v[a].add(b);
            v[b].add(a);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(v[i]);
        }
        dfs(v, isVisited, s, writer);
        writer.newLine();
        Arrays.fill(isVisited, false);
        bfs(v, isVisited, s, writer);
        //dfs_stack(v, s, writer);
        //bfs_queue(v, s, writer);
        writer.flush();
        writer.close();
    }
}
