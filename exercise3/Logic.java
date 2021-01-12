package by.jonline.grow.basicsofoop.exercise3;

public class Logic {

    public Calendar.Date[] generateDays(boolean leapYear, int firstSaturday) {

        if (firstSaturday > 7 || firstSaturday < 1) {
            return null;
        }

        Calendar.Date[] days;
        int saturday;
        int sunday;
        int dayInd;

        saturday = firstSaturday;
        sunday = saturday + 1;
        dayInd = 0;

        if (leapYear) {
            days = new Calendar.Date[366];
        } else {
            days = new Calendar.Date[365];
        }
        //январь - июль
        for (int i = 1; i <= 7; i++) {

            if (i == 2) {
                if (leapYear) {
                    //29

                    for (int j = 1; j <= 29; j++, dayInd++) {
                        days[dayInd] = new Calendar.Date(j, i, saturday == j || sunday == j);
                        if (saturday == j) {
                            saturday += 7;
                        }
                        if (sunday == j) {
                            sunday += 7;
                        }
                    }

                    saturday -= 29;
                    sunday -= 29;

                } else {
                    //28

                    for (int j = 1; j <= 28; j++, dayInd++) {
                        days[dayInd] = new Calendar.Date(j, i, saturday == j || sunday == j);
                        if (saturday == j) {
                            saturday += 7;
                        }
                        if (sunday == j) {
                            sunday += 7;
                        }
                    }

                    saturday -= 28;
                    sunday -= 28;

                }
                continue;
            }

            if (i % 2 == 0) {
                //30

                for (int j = 1; j <= 30; j++, dayInd++) {
                    days[dayInd] = new Calendar.Date(j, i, saturday == j || sunday == j);
                    if (saturday == j) {
                        saturday += 7;
                    }
                    if (sunday == j) {
                        sunday += 7;
                    }
                }

                saturday -= 30;
                sunday -= 30;

            } else {
                //31

                for (int j = 1; j <= 31; j++, dayInd++) {
                    days[dayInd] = new Calendar.Date(j, i, saturday == j || sunday == j);
                    if (saturday == j) {
                        saturday += 7;
                    }
                    if (sunday == j) {
                        sunday += 7;
                    }
                }

                saturday -= 31;
                sunday -= 31;

            }


        }

        //август - декабрь
        for (int i = 8; i <= 12; i++) {

            if (i % 2 == 0) {
                //31

                for (int j = 1; j <= 31; j++, dayInd++) {
                    days[dayInd] = new Calendar.Date(j, i, saturday == j || sunday == j);
                    if (saturday == j) {
                        saturday += 7;
                    }
                    if (sunday == j) {
                        sunday += 7;
                    }
                }

                saturday -= 31;
                sunday -= 31;

            } else {
                //30

                for (int j = 1; j <= 30; j++, dayInd++) {
                    days[dayInd] = new Calendar.Date(j, i, saturday == j || sunday == j);
                    if (saturday == j) {
                        saturday += 7;
                    }
                    if (sunday == j) {
                        sunday += 7;
                    }
                }

                saturday -= 30;
                sunday -= 30;

            }


        }


        return days;
    }


}
