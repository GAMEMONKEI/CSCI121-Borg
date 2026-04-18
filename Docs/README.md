# CSCI121-Borg: The Mission
1
Elements of Computer Programming II (CSCI-121)
Spring 2026 – Term Group Project
A MAZE’n Robot!
Purpose
The objectives of this project are:
1. To promote group work and the sharing of ideas and tasks.
2. To promote life-long learning.
3. To empower students with the opportunity to realize that they are capable of attaining
skill sets on their own with some effort.
4. To design and synthesize a robotic challenge that requires putting together many of the
concepts and elements learned throughout this semester.
Timeline and Due Date
This project is a group-based project and requires your group to produce a functional robot as
explained below. Your group will also be required to give a ten-minute final presentation and
demonstration on the date indicated below. Your group will need to schedule a weekly one hour
meeting with your instructor outside of class time, referred to below as GMI. The following are
milestones that your group are expected to meet. Failure to meet any of these milestones will
severely affect your project grade.
Date Work and Milestones
Week of January 19 MLK Day on Monday 1/19 – No Class
Week of January 26 Snow and Ice – classes were canceled
Week of February 2
Kick-off and framing of project; Design Thinking + Scrum
framework; Create project board in GitHub Projects; Work on
problem statement
Week of February 9
Sprint Retrospective; Sprint Review; Finalize and submit problem
statement; Work on How Might We questions (HMW) and begin
ideation; peer review
Week of February 16 Sprint Retrospective; Sprint Review; Finalize HMW; Begin work
on ideation; submit ideation work; peer review
Week of February 23
Sprint Retrospective; Sprint Review; Finalize Ideation begin
working on product backlog; Begin work on ideation; submit
2
ideation work; peer review
Week of March 2 Sprint Retrospective; Sprint Review; complete first iteration of
product backlog; sprint planning meeting; peer review
Week of March 9 No Class. Sprint Retrospective; Sprint Review; Continue work
on product backlog; update scrum board; peer review
Week of March 16 Sprint Retrospective; Sprint Review; Continue adding items to
product backlog; begin prototyping; peer review
Week of March 23 Sprint Retrospective; Sprint Review; Continue adding items to
product backlog; continue prototyping; peer review
Week of March 30 Sprint Retrospective; Sprint Review; sprint planning; peer review
Week of April 6
Easter Break – No Classes; Sprint Retrospective; Sprint Review;
sprint planning; Continue work on product backlog; update scrum
board; peer review
Week of April 13
Sprint Retrospective; Sprint Review; sprint planning; Continue
work on product backlog; update scrum board; peer review
Week of April 20 Mock Presentations
Week of April 27 Work on finishing the project; Final Presentation
May 4, 2026 Submit presentation and project deliverables
Groups may request time with the instructor for help at any time; however, groups will be
required to schedule a weekly meeting with the instructor, as mentioned above, to discuss
progress on the project. Difficulties with technical issues or group dynamics can be discussed at
that meeting. Each meeting presentation should include specific work of each member of the
team. The “mock” presentation exists to allow the group to receive feedback for improvement
before the final presentation.
Project Storyline
You and your team are employees of Starfleet Command assigned as robotics experts to explore
uninhabitable Class K planets. During one of its missions, the Enterprise discovers a Class K
planet at the border of the alpha/gamma quadrant. The planet is believed to hold a considerable
quantity of Dilithium crystals. Due to the volatile nature of the gamma quadrant, a human
expedition to the planet is not viable. You receive orders from Starfleet Command to prepare a
robot explorer capable of finding and collecting a sample from the planet’s surface. Your robot
will be delivered to the planet on board the U.S.S. Enterprise. The Enterprise will remain at the
edge of the Alpha Quadrant with your team on board.
Your task, which you have no choice but to accept, is to prepare an exploratory robot capable of
navigating the planet’s maze-like terrain, acquiring a sample, and returning to the point of
extraction, which is at the same location as the point of insertion. Your robot must be able to
autonomously avoid or push aside obstacles in the maze. Your robot is equipped with a camera
that can be trained to detect objects, follow lines, read tags/QR codes, and more. Your camera is
not equipped to process pictures and videos; it acts more like a sensor that provides decisions
based on what it is trained to detect.
3
To make matters worse, your team must complete the mission within 5 minutes. This means
your team will have to design a robot with appropriate autonomous behaviors. For example, a
movable obstacle obscures the path to the sample. Move the MoOb out of the way so that you
can continue your mission. Immovable obstacles are connected or placed next to the maze
wall. Those can be avoided and treated in the same way as a wall.
A year ago, a Federation starship flyby completed a scan of the planet resulting, in the terrain
mapping shown in Figure 1 localized to the sample area:
Figure 1: Terrain mapping local to the sample area obtained on star date 43125.3.
Due to the abundance of Dilithium crystals, the tectonic plates tend to be active, and you can
expect changes to the area. Your robot design cannot account for the maze structure shown in
Figure 1. Its behavior must reflect the sensory input that it receives. You can use any sensor
available to complete the mission.
Your team will be using a spread-spectrum frequency to hide communication between the robot
and the Enterprise computer. Your team will begin immediately working on a robot design that
incorporates behaviors appropriate for a maze-traversing robot.
The team has decided to take a design thinking approach to the solution to this challenge. The
team will employ the Scrum methodology to manage and implement the project, using Git,
GitHub, GitHub Projects, and GitHub Wiki to manage the project and document the design and
your contributions. Doing so means learning Markdown!
The future of Star Fleet is in your hands! Failure is not an option!
Project Requirement
The team is required to implement a robot that is able to carry out the mission described in the
previous section. The robot must be able to:
4
• Autonomously navigate a maze whose walls consist of black one to one and a half inch
thick tape. The maze will also contain obstacles that the robot must avoid or move out of
the way. The robot is placed at the entrance of the maze (i.e. the mission insertion point
discussed in the previous section). Since this will use behavior-based control, discuss
your finite-state machine designs in your presentation and include them in your
deliverable.
• Use the line and camera sensors to stay within the maze, obstacle and camera sensors to
avoid obstacles and to detect the sample. The camera can be used to learn colors and
detect colored balls. The camera can also detect lines and keep the robot inside the maze.
Finally, the camera can read QR/codes to identify other features in the maze.
• The robot must identify the sample using an audible or visual cue. Returning to the
insertion point within mission time will result in 20 points added to the overall
project score.
• The following colors and objects will be used for identification.
Object Color Represents
Ball or Cup Green Movable Object (MoOb)
Ball or Cup Blue Immovable Object
Cup Red Sample
Ball Yellow Insertion Point
Presentation Requirements
Your group will be required to give a presentation, which must include a PowerPoint document
that will be used to convey the ideas incorporated into your project. Your group will
demonstrate the project at the end of the presentation (see section on Project Demonstration).
The presentation should include the following elements:
1. An introductory slide that motivates your talk and captures the audiences attention. A
story or interesting statistics would be one way of capturing attention. Your slide should
answer the question, why should you pay attention to my talk? Note: Please DO NOT
put on the slide or say in your presentation, why should you pay attention to my talk?
5
2. The body of your talk should address the following:
a. A description of how your group’s objective were achieved as it relates to this
mission;
b. A description of the methodology and the design concept the team applied,
including design thinking, Scrum, finite state machines, protocols, and robot
behaviors.
c. A clear explanation of the roles of each team member; how the strengths and
weaknesses of each member played a role in this project. There should be an
explanation of some of the challenges encountered. NOTE: every member has
to code on a weekly basis!
3. A conclusion or summary slide that winds down your talk appropriately.
A couple of recommendations on making and using PowerPoint slides:
• Slides should not be cluttered with a lot of wording. Bullet points should be placed to
guide you and the audience. The audience should be listening to you. If a bullet point is
verbose, then the audience will cease listening to you and begin reading.
• Whenever possible, use graphical illustrations to communicate your ideas and concepts.
Illustrations are a very powerful way of communicating abstract or difficult concepts.
• Use animation only when appropriate. Overuse of animation can detract from your
message and come across as pretentious.
Please make sure that the presentation is prepared well in advance of the talk. Ensure that your
presentation covers all the elements discussed above as well as those in the rubrics (available at
the end of this document). Make sure that every member is familiar with all aspects of the
project. Those working on specific tasks in the project will be the group’s experts on those
specific tasks. However, each member must program some component in this project. You
may help each other with the coding. Make sure that this is coordinated, logically organized in
your presentation, and communicated within the group.
As in everything, practice makes perfect! Groups should practice their presentation before and
after receiving feedback. Make sure that everyone knows their role. The audience should not
have to see the group figure things out during the presentation. If this happens, your group will
surely loose points!
Project Demonstration
The team may choose to demonstrate the project before, during, or at the end of the presentation.
6
Group Work
Since this is a group and software development project, we will follow the agile Scrum
methodology. Scrum is a process framework that manages software project
development. Therefore, you will eventually need to select a Scrum Master. Next, you will
learn the role of the Scrum Master and the rules required by the Scrum process (some of you may
already be familiar with this role).
A peer assessment is administered at the end of each week to check on the group's progress. The
peer assessment differentiates the project grade for each group member. Forgetting to complete
the peer assessment severely affects your project grade. The sprint retrospective uses peer
assessment to address group dynamics. Group members will have the opportunity to
anonymously elect to fire a member who fails to carry out their assigned tasks or fails to
participate in group meetings. Should a majority of the group recommend dismissal, the faculty
member shall consult with the individual and place the individual on probation along with a
project improvement plan (PIP). If individuals on PIP do not improve, the faculty member shall
decide to fire them. Dismissal from the group will result in an automatic zero (0) on the project
and presentation.
Submitting Your Work
You are required to submit the following:
1. The team’s GitHub repo link, which will include the code, project board, and completed
tasks, and the Wiki page, which should document the Design Thinking process and
outcomes, Scrum methodology used, and any design work, including the finite-state
machines.
2. The PowerPoint presentation used in the talk.
Any team member may submit on behalf of the entire group.
If your group does not present, the entire group will receive no credit for the presentation portion
of your grade. If you do not submit your work by the submission deadline, then the entire group
will receive no credit for the group project.
Organize item 1 above in a logical manner so that there is clarity and continuity to the
reader. Document all design work on the group’s Wiki page. The Wiki page should be
established, and documentation of the process should begin in week 1 of the project.
Delaware State University
Department of Computer and Information Sciences
Elements of Computer Programming II (CSCI-121)
Term Project Rubric
Category 0
Not Available
1
Incomplete
2
Developing
3
Accomplished
4
Exemplary Score
Design
Behaviors
Designed
(10 Points) 2.5
Nothing submitted
The design captures almost none of
the necessary behaviors needed for the
robot to succeed in its mission.
The design captures few of the
necessary behaviors needed for
the robot to succeed in its
mission.
The design captures most of the
necessary behaviors needed for
the robot to succeed in its
mission.
The design captures all of the
necessary behaviors needed for
the robot to succeed in its
mission.
Finite State
Machines
(10 Points) 2.5
Nothing submitted
The design does not use the correct
FSM diagrams to model the state of
objects. The problem is modeled
incorrectly.
The design uses mostly correct
FSM diagrams to model the the
state of objects; some minor
errors exist in the modeling.
The design uses correct FSM
diagrams to model the the state
of objects; some minor errors
exist in the modeling.
The design uses correct FSM
diagrams to model the problem;
the problem is modeled
correctly.
Communication
Protocol Design
(10 Points) 2.5
Nothing submitted
The design choice of the
communication protocol is completely
inappropriate for the mission defined.
The design choice of the
communication protocol is
somewhat inappropriate for the
mission defined.
The design choice of the
communication protocol is
mostly appropriate for the
mission defined.
The design choice of the
communication protocol is very
appropriate for the mission
defined.
Implementation
Behavior/Finite
State Machines
Implementation
(10 Points) 2.5
Nothing submitted
The implementation of the
Behavior/Finite State Machines is
mostly incorrect.
The implementation of the
Behavior/Finite State Machines
is somewhat incorrect.
The implementation of the
Behavior/Finite State Machines
is mostly correct.
The implementation of the
Behavior/Finite State Machines
is correct.
Robot Class
Implementation
(10 Points) 2.5
Nothing submitted The robot class is not implemented.
The robot class implementation
is missing many key
components.
The robot class implementation
is missing some key
components.
The robot class implementation
is complete.
Implementation of
Communication
Protocols
(10 Points) 2.5
Nothing submitted
The implementation of the
communication protocols is
completely incorrect or not
implemented.
The implementation of the
communication protocols is
somewhat incorrect
The implementation of the
communication protocols is
mostly correct
The implementation of the
communication protocols is
correct
Creativity
Creativity
(10 Points) 2.5
Nothing submitted
Vaguely demonstrates creative ability;
fails to utilize the creative process
when addressing problem or on
project; exhibits little or no originality
or imagination in work.
Demonstrates some creative
ability; Attempts to utilize the
creative process when
addressing problem or on
project; exhibits some
originality or imagination.
Adequately demonstrates
creative ability; exhibits
originality or imagination in
problems or projects; applies
creative process to work.
Demonstrates creative ability;
utilizes the creative process
when addressing problems or on
projects; exhibits high level of
originality and imagination in
work
Documentation of Project
Structure and
Organization
(10 Points) 2.5
Nothing submitted
Unclear structure with paragraphs
lacking cohesion and failing to
support major points; transition
between paragraphs lack coherence
and may have one or more
digressions.
Inconsistent organization with
occasional support of major
points but unclear and/or
incoherent transition between
paragraphs
Competent organization with
paragraphs that support major
points. Appropriate transitions
between paragraphs
Organization is sequential and
appropriate to the assignment.
Paragraphs are appropriate and
purposeful. Ideas are logically
presented and interrelated;
transitions are linked with
smooth and effective transitions.
Sentence
Structure and
Grammar
(10 Points) 2.5
Nothing submitted
Simple sentences used almost
exclusively with frequent errors in
sentence structure; Contains many
errors in punctuation, spelling and
capitalization; errors significantly
interfere with meaning and formatting
is weak.
Varied sentences with
occasional errors in sentence
structure; shows insufficient
effort in proofreading to identify
errors in spelling, punctuation,
capitalization, grammar and
syntax errors and/or use of
colloquialisms
Effective and varied sentences
with infrequent errors due to
lack or proofreading, syntax
errors and/or use of
colloquialisms; infrequent errors
in punctuation, spelling and
capitalization
Each sentence is effectively
structured, using a rich and
well-chosen variety of sentence
styles and length. Free of
punctuation, spelling and
capitalization errors; appropriate
forms and presentation for
assignment.
Vocabulary and
Usage
(10 Points) 2.5
Nothing submitted
Extremely limited or inappropriate
vocabulary which lack a grasp of
diction. Inaccurate usage
Range of vocabulary that is
limited and inconsistent usage
Good range of vocabulary with
accurate usage
Exceptional vocabulary range
with accuracy and effective
word usage
Delaware State University
Department of Computer and Information Sciences
Group Presentation Rubric
Presenters’ names: ___________________________________________________________________
1
Incomplete
2
Developing
3
Accomplished
4
Exemplary
Comments
Organization
Audience cannot
understand presentation
because there is no
sequence of information.
Audience has difficulty
following the
presentation because the
sequence of information
is haphazard.
The group presents
information in a logical
sequence, which audience
can follow.
The group presents
information in a logical
and interesting
sequence, which the
audience can follow
Content Knowledge
Members of the group
do not have an
understanding of the
topic. They cannot
answer any questions.
Some members of the
group are uncomfortable
with the topic and are
only able to answer
rudimentary questions.
Most members of the
group are at ease with
content, but do not
always elaborate on
questions.
All students in the group
demonstrate full
knowledge with
explanations and
elaboration.
Supporting Material
Students used no
graphs, figures,
statistics, or data.
Students occasionally
used graphs, figures,
statistics, or data, but
not effectively.
Students used graphs,
figures, statistics, or data
effectively.
Students used graphs,
figures, statistics, or
data in a compelling and
informative way.
Mechanics
The material was
illegible, contained
many errors and/or was
presented too quickly to
see.
The material was
legible, but contained
some errors or too much
information to read at
the pace of the
presentation.
The material was easy to
read, had few errors and
was presented at a pace
that was easy to follow.
The material was easy to
read, and organized
well, with no errors.
Presented at pace that
maintained interest in
the subject.
Delivery
Presenters mumble
and/or speak too quietly.
Lack of enthusiasm
and/or interest. No eye
contact, read directly
from notes. Members of
the group do not interact
at all.
Presenters occasionally
speak too quietly. Lack
energy. Infrequent eye
contact, heavily rely on
notes. Members of the
group interact
ineffectively. Some
members dominate.
Presenters speak clearly
and show interest. Make
eye contact with some of
the audience. Members
of the group interact well
and share the delivery
equally.
Presenters speak clearly
and show enthusiasm.
Hold attention by direct
eye contact with all
parts of the audience.
Members of the group
interact dynamically as
a group in a way that
enhances understanding
and clarity.
