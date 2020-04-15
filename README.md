# Equals

equal:是用來比較兩個物件內部的內容是否相等的，由於所有的類都是繼承自java.lang.Object類的，所以如果沒有對該方法進行覆蓋的話，呼叫
的仍然是Object類中的方法，而Object中的equal方法返回的卻是==的判斷，因此，如果在沒有進行該方法的覆蓋後，呼叫該方法是沒有
任何意義的。在java物件導向的處理中我們一般在javabean中都要選擇重寫equals方法，使用hibernate後，我們要生成資料庫的對映檔案與實體
類，這是我們就最好在實體類中進行equals方法的重寫，重寫時我們可以根據自己的定義來實現該方法只要遵守那五條原則，例如對於一個student類
我們定義只要在學號相同時我們就認為這兩個物件時相等的；同時我們還要重寫hashcode方法

==：是用來判斷兩個物件的地址是否相同，即是否是指相同一個物件。比較的是真正意義上的指標操作。
