package com.ebay.domain.ocsdecisioning.common;

public class ImplementSquareRoot {

        public static void main(String[] args) {
            System.out.println(mySqrt(8));
        }

        public static int mySqrt(int x) {
            if (x == 0) {
                return 0;
            }

            int start = 1;
            int end = x;
            int ans = 0;

            while (start < end) {
                int mid = start + (end - start) / 2;

                if(mid == x/mid) {
                    return mid;
                } else if (mid < x/mid) {
                    ans = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;

                }
            }

            return ans;
        }
}
