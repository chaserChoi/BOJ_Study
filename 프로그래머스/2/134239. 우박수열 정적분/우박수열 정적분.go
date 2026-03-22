func solution(k int, ranges [][]int) []float64 {
    // 우박 수열
	seq := []int{k}
	for k > 1 {
		if k%2 == 0 {
			k /= 2
		} else {
			k = k*3 + 1
		}
		seq = append(seq, k)
	}

	n := len(seq) - 1 // 1이 될 때까지 총 횟수

	// 사다리꼴 넓이 누적합 배열
	prefixArea := make([]float64, n+1)
	for i := 0; i < n; i++ {
		area := float64(seq[i]+seq[i+1]) / 2.0
		prefixArea[i+1] = prefixArea[i] + area
	}

	// 주어진 구간(ranges) 정적분
	ans := make([]float64, len(ranges))
	for i, r := range ranges {
		a := r[0]
		b := r[1]
		end := n + b // 끝점

		if a > end {
			ans[i] = -1.0
		} else {
			ans[i] = prefixArea[end] - prefixArea[a]
		}
	}

	return ans
}