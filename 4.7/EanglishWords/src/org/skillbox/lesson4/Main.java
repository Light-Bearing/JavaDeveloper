package org.skillbox.lesson4;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String text = "The Supreme Court has given the Trump administration an immigration policy victory by ruling criminal noncitizens can be detained at any time.\n" +
                "\n" +
                "The 5-4 ruling states federal officials may detain convicted immigrants indefinitely after they finish serving prison time, even years after.\n" +
                "\n" +
                "Advocates had argued the law only allowed for detention immediately after immigrants were released from prison.\n" +
                "\n" +
                "The court's liberal justices dissented from the conservative decision.\n" +
                "\n" +
                "Tuesday's ruling reversed a lower court decision that had found the existing law to mean federal authorities must detain convicted immigrants within 24 hours of their release from criminal detention.\n" +
                "\n" +
                "Civil rights lawyers had claimed after that deadline, immigrants should be permitted a bond hearing so they were not forced to remain in custody indefinitely while their deportation case went forward.\n" +
                "\n" +
                "The Trump administration, however, said the government should be allowed to hold convicted noncitizens at any time - and the conservative-majority top court has agreed.\n" +
                "\n" +
                "In the conservative opinion, Associate Justice Samuel Alito said the strict ruling was to ensure homeland security officials were not constrained by inappropriate deadlines to detain convicted noncitizens.\n" +
                "\n" +
                "\"As we have held time and again, an official's crucial duties are better carried out late than never,\" he wrote, adding that such a tight deadline was often not feasible logistically speaking.\n" +
                "\n" +
                "Meet the Supremes - the judges on the top US court\n" +
                "Why US top court is more political than UK's\n" +
                "Justice Alito also noted that it was not meant to target noncitizens who had served time and continued to lead legal lives in their communities, and said the decision still allows for those individuals to challenge the law on constitutional grounds if they are detained.\n" +
                "\n" +
                "Associate Justice Stephen Breyer wrote the dissent for the court's liberals - and in a rare move, delivered it from the bench, US media reported.\n" +
                "\n" +
                "\"The greater importance of the case lies in the power that the majority's interpretation grants the government,\" Justice Breyer said in his summary.\n" +
                "\n" +
                "\"It is a power to detain persons who committed a minor crime many years before. And it is a power to hold those persons, perhaps for many months, without any opportunity to obtain bail.\"\n" +
                "\n" +
                "The case brought before the top court was a California class-action lawsuit by a group of noncitizens, most with permanent residency cards, whose lawyers argued they should be entitled to a hearing if they were detained by federal authorities more than a day after their release from prison.\n" +
                "\n" +
                "Six surprising statistics about immigrants in the US\n" +
                "Homeland security secretary walks a tightrope for Trump\n" +
                "Lead plaintiff Mony Preap was a legal resident who had two convictions involving marijuana possession. He was taken into federal custody in 2013, years after serving his prison time, but eventually won his deportation case, the Associated Press reported.";
        String word[] = text.replaceAll("[0-9\\-.,\n]+", "").replaceAll("[\\s]{2,}", " ").split("\\s");
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }


    }
}
