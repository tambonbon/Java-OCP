package Enthuware._13Security;

public class Security2 {

    static class Point { }

    static class Shape {
        Point[] vertices;

        public Shape(Point[] verts) { this.vertices = verts;} 

        public Point[] getVertices() { return vertices; }

        public void setVertices(Point[] vertices) {
            this.vertices = vertices;
        }
    }

    /**
     * 1. Change getVertices to return vertices.clone
     * -- Mutability should be avoided as much as possible..
     * .. when you return a reference to array, other code may modify contents of that
     * .. to prevent this ---> return a clone
     * 2. Change setVertices to `this.vertices = vertices.clone()`
     * -- Always clone input arrays and collection
     * 3. Make vertices field private
     * -- Fields should be private
     * 4. Vertices is not required to be final
     * -- Since the class is not final --> seems not to be an immutable class --> not required
     */
}
