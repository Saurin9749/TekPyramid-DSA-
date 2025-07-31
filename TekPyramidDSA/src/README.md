Logic Breakdown
Ensure smaller array first

Swap arrays if needed so that we always binary search on the smaller array.

Store lengths and target left partition size

m = length of smaller array

n = length of larger array

totalLeft = (m + n + 1) / 2 → number of elements that should be on the left half.

Initialize binary search

Start with left = 0 and right = m.

Binary search loop

Calculate partition index for smaller array (partition1) using mid-point.

Calculate partition2 = remaining elements for left partition.

Get border values

From both arrays, identify:

maxLeft1 = largest element left of partition in array1.

minRight1 = smallest element right of partition in array1.

Similarly for array2.

Check valid partition condition

If maxLeft1 <= minRight2 AND maxLeft2 <= minRight1, correct partition is found.

Find median

If total elements are even, median = average of max(left parts) & min(right parts).

If odd, median = max(left parts).

Adjust search if partition incorrect

If maxLeft1 > minRight2, move binary search left (reduce partition1).

Else, move right (increase partition1).

Return result

The loop ends when the correct partition is found and median is computed.

