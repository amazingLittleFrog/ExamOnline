package cn.xxn.ctest.answerstate.entity;
/**
 * ѧ������Ĵ������
 */
import cn.xxn.ctest.question.entity.Question;
import cn.xxn.ctest.testnote.entity.TestNote;

public class AnswerState {
	private Integer anid;	//�������id
	private Integer state;	//�������
	private Question question;	
	private TestNote testNote;
	
	public Integer getAnid() {
		return anid;
	}
	public void setAnid(Integer anid) {
		this.anid = anid;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public TestNote getTestNote() {
		return testNote;
	}
	public void setTestNote(TestNote testNote) {
		this.testNote = testNote;
	}
}