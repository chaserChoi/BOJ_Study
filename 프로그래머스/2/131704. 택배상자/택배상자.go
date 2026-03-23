func solution(order []int) int {
    // 보조 컨테이너 벨트 역할
	var stack []int

	orderIdx := 0 // 현재 트럭에 실어야 하는 order 배열 index
	n := len(order)

	for box := 1; box <= n; box++ {
		stack = append(stack, box) // 보조 컨테이너 벨트에 밀어 넣음

		// 스택의 맨 위(가장 최근) 상자가 현재 실어야 할 순서와 맞는지 확인
		for len(stack) > 0 && stack[len(stack)-1] == order[orderIdx] {
			stack = stack[:len(stack)-1] // pop
			orderIdx++                   // 다음 순서
		}
	}

	return orderIdx
}