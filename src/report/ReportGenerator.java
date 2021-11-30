/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import java.util.List;

/**
 *
 * @author howar
 */
public class ReportGenerator {

    private List<? extends Generatable> subjects;
    public static final String HORIZONTAL_LINE = "===========================================================";
    public static final String LINE_SEPERATOR = System.getProperty("line.separator");

    public ReportGenerator(List<? extends Generatable> subjects) {
        this.subjects = subjects;
    }

    public List<? extends Generatable> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<? extends Generatable> subjects) {
        this.subjects = subjects;
    }

    public String getRawContent() {
        StringBuilder strb = new StringBuilder();

        for (int i = 0; i < subjects.size(); i++) {

            strb.append(LINE_SEPERATOR);
            strb.append(subjects.get(i).getGenerateTitle());
            strb.append(LINE_SEPERATOR);
            strb.append(HORIZONTAL_LINE);
            strb.append(LINE_SEPERATOR);
            strb.append(subjects.get(i).getGenerateContent());
            if (i != subjects.size() - 1) {
                strb.append(LINE_SEPERATOR);
                strb.append(HORIZONTAL_LINE);
                strb.append(HORIZONTAL_LINE);
                strb.append(LINE_SEPERATOR);
            }
        }

        return strb.toString();
    }

}
