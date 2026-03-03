class FindKthBitInNthBinaryString {

        public char findKthBit(int n, int k) {
            String s = "0";

            for (int i = 1; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                s = sb.append(s).append('1').append(reverse(invert(s))).toString();
            }

            return s.charAt(k - 1);
        }

        private String invert(String s) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                sb.append(c == '0' ? '1' : '0');
            }
            return sb.toString();
        }

        private String reverse(String s) {
            return new StringBuilder(s).reverse().toString();
        }
    }