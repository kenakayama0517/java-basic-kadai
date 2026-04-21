package kadai_021;



public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        // 1. 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 2. 辞書の初期化（単語の登録）
        dictionary.addWords();

        // 3. 調べる英単語を配列にセット
        String[] searchList = {"apple", "banana", "grape","orange"};

        // 4. 調べる英単語の数だけ繰り返し
        for (String word : searchList) {
            dictionary.search(word); // 辞書クラスに検索を依頼
        }
    }
}