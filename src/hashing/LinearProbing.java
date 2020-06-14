package hashing;

public class LinearProbing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void linearProbing(int hash_table[], int hash_size, int arr[], int array_size) {
		for (int i = 0; i < array_size; i++)// Iterating over the array
		{
			if (hash_table[arr[i] % hash_size] == -1)// If the place is empty then insert arr[i] at that place
			{
				hash_table[arr[i] % hash_size] = arr[i];
			} else 
			
			{// else linearly move from the filled position to find an empty place. Mod by
					// hashSize ensures that we remain inside the hashTable
				int counter = 0;
				int k = (1 + arr[i]) % hash_size;
				while (counter < hash_size && hash_table[k] != -1) {
					k = (k + 1) % hash_size;
					counter++;
				}
				if (counter < hash_size)// If we find a position where arr[i] can be inserted then we insert
					hash_table[k] = arr[i];
			}
		}
	}

}
