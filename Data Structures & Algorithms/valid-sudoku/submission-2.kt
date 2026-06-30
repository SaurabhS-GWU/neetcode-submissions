class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        //is it best to first make a list of Lists? 
        for(row in 0 until 9){
            val seen = mutableSetOf<Char>() 
            for(i in 0 until 9){
                if(board[row][i] == '.') continue 
                if(board[row][i] in seen) return false
                seen.add(board[row][i])
            }
        }
        for(col in 0 until 9){
            val seen = mutableSetOf<Char>()
            for(j in 0 until 9){
                if(board[j][col] == '.') continue 
                if(board[j][col] in seen) return false 
                seen.add(board[j][col])
            }
        }
        for(square in 0 until 9){
            val seen = mutableSetOf<Char>() 
            for(i in 0 until 3){
                for(j in 0 until 3){
                    val row = (square / 3) * 3 + i 
                    val col = (square % 3) * 3 + j 
                    val ele = board[row][col]
                    if(ele == '.') continue
                    if(ele in seen) return false
                    seen.add(ele)
                }
            }
        }
        return true 
        
    }
}
//Brute force approach 
// isValidRow 
// // call on each row from 1 to 9 
// // go over all columns for the row to make sure it does not repeat numbers 
// //return false if ever the condition fails 


// isValidCol 
// //call on each column 
// //go over all rows to make sure numbers dont repeat 
// //return false if ever the condition fails 

// isValidBox 
// 0,0 0,1 0,2  0,3 0,4 0,5 
// 1,0 1,1 1,2   
// 2,0 2,1 2,2  

//Things to remember 
//mutableSet must be used as we need to add elements to set
//Be mindful of where the set is intiated. Should be initiated after every 9 iterations. 



