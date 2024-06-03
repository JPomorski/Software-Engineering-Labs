import java.util.List;

public class Recipes {
    public static class Combine implements Recipe {
        private final int id;

        public Combine(List<Recipe> items) {
            StringBuilder code = new StringBuilder();

            for(Recipe item : items) {
                code.append(item.id());
            }

            this.id = switch(code.toString()) {
                case "33" -> 4;
                case "45" -> 10;
                case "222" -> 5;
                case "333" -> 6;
                default -> -1;
            };
        }

        @Override
        public int id() {
            return id;
        }

        @Override
        public String evaluate(Context context) {
            return context.getItem(id);
        }
    }

    public static class Convert implements Recipe {
        private final int id;

        public Convert(Recipe item) {
            this.id = switch (item.id()) {
                case 1 -> 3;
                case 2 -> 9;
                default -> -1;
            };
        }

        @Override
        public int id() {
            return id;
        }

        @Override
        public String evaluate(Context context) {
            return context.getItem(id);
        }
    }

//    public static class CombineTwo implements Recipe {
//        private final int id;
//
//        @Override
//        public int evaluate() {
//            return id;
//        }
//
//        public CombineTwo(Recipe item1, Recipe item2) {
//            String code = Integer.toString(item1.evaluate()) + item2.evaluate();
//            this.id = switch (code) {
//                case "11" -> 4;
//                case "45" -> 10;
//                default -> -1;
//            };
//        }
//    }
//
//    public static class CombineThree implements Recipe {
//        private final int id;
//
//        public CombineThree(Recipe item1, Recipe item2, Recipe item3) {
//            String code = Integer.toString(item1.evaluate()) + item2.evaluate() + item3.evaluate();
//            this.id = switch (code) {
//                case "222" -> 5;
//                case "111" -> 6;
//                default -> -1;
//            };
//        }
//
//        @Override
//        public int evaluate() {
//            return id;
//        }
//    }
}
