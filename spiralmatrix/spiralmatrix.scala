

object spiralmatrix {
  def main(args: Array[String]): Unit = {
    val x = Array(
      Array(3, 5, 7, 4),
      Array(0, 4, 9, 5),
      Array(1, 8, 6, 7),
      Array(8, 0, 2, 5)
    )
    val m=4;
    val n=4;
    var T = 0;
    var R = m - 1;
    var B = n - 1;
    var L = 0;
    var dir = 0;

    while (T <= B && L <= R) {
      if (dir == 0) {
        for (i <- L to R)
          print(x(T)(i));
        T = T + 1;
        dir = 1;
      }
      else if (dir == 1) {
        for (i <- T to B)
          print(x(i)(B));
        R = R - 1;
        dir = 2;
      }
      else if (dir == 2) {
        for (i <- R to L by -1)
          print(x(B)(i));
        B = B - 1;
        dir = 3;
      }
      else if (dir == 3) {

        for (i <-B to T by -1)
          print(x(i)(L))
        L= L+1;
        dir=0
      }
    }
  }
}

