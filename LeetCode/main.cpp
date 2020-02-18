#include <iostream>

namespace std {
    struct ListNode {
        int val;
        ListNode *next;

        ListNode(int x) : val(x), next(NULL) {}
    };
    class Solution {
    public:
        void deleteNode(ListNode node) {
            node->val = node->next->val;
            node->next=node->next->next;
        }
    };

    int main() {
        std::cout << "Hello, World!" << std::endl;
        Solution s = Solution();

        return 0;/**/
    }

    

}