package com.example.ai_test;

import java.util.List;

/**
 * Created by 威爸爸 on 2018/9/15.
 */

public class RecResult {

    /**
     * log_id : 1827577988441212784
     * result : [{"score":0.95327699184418,"name":"木鳖子"},{"score":0.013371258042753,"name":"刺果番荔枝"},{"score":0.012931521050632,"name":"海南铁角蕨"},{"score":0.0049171252176166,"name":"鳄梨"},{"score":0.0023271152749658,"name":"天南星"}]
     */

    private long log_id;
    private long result_num;
    private List<ResultBean> result;

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }

    public long getResult_num() {
        return result_num;
    }

    public void setResult_num(long result_num) {
        this.result_num = result_num;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * score : 0.95327699184418
         * name : 木鳖子
         */

        private double score;
        private String root;
        private String keyword;

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public String getRoot() {
            return root;
        }

        public void setRoot(String root) {
            this.root = root;
        }

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "score=" + score +
                    ", root='" + root +
                    ", keyword='" + keyword + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "RecResult{" +
                "log_id=" + log_id +
                ", result=" + result +
                '}';
    }
}
